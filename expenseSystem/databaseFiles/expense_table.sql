-- Table: public.ers_reimbursement

-- DROP TABLE public.ers_reimbursement;

CREATE TABLE public.ers_reimbursement
(
  reimb_id integer NOT NULL DEFAULT nextval('ers_reimbursement_reimb_id_seq'::regclass),
  reimb_amount money NOT NULL,
  reimb_submitted timestamp without time zone NOT NULL,
  reimb_resolved timestamp without time zone,
  reimb_description character varying(250),
  reimb_author integer NOT NULL,
  reimb_resolver integer,
  reimb_status character varying(10) NOT NULL,
  reimb_type character varying(10) NOT NULL,
  CONSTRAINT ers_reimbursement_pkey PRIMARY KEY (reimb_id),
  CONSTRAINT ers_users_fk_auth FOREIGN KEY (reimb_author)
      REFERENCES public.ers_users (ers_users_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT ers_users_fk_reslvr FOREIGN KEY (reimb_resolver)
      REFERENCES public.ers_users (ers_users_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ers_reimbursement
  OWNER TO postgres;

-- Index: public.fki_ers_users_fk_auth

-- DROP INDEX public.fki_ers_users_fk_auth;

CREATE INDEX fki_ers_users_fk_auth
  ON public.ers_reimbursement
  USING btree
  (reimb_author);

-- Index: public.fki_ers_users_fk_reslvr

-- DROP INDEX public.fki_ers_users_fk_reslvr;

CREATE INDEX fki_ers_users_fk_reslvr
  ON public.ers_reimbursement
  USING btree
  (reimb_resolver);



-- Table: public.ers_user_roles

-- DROP TABLE public.ers_user_roles;

CREATE TABLE public.ers_user_roles
(
  ers_user_role_id integer NOT NULL,
  user_role character varying(10) NOT NULL,
  CONSTRAINT ers_users_roles_pk PRIMARY KEY (ers_user_role_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ers_user_roles
  OWNER TO postgres;


-- Table: public.ers_users

-- DROP TABLE public.ers_users;

CREATE TABLE public.ers_users
(
  ers_users_id integer NOT NULL,
  ers_username character varying(50),
  ers_password character varying(50) NOT NULL,
  user_email character varying(150),
  user_role_id integer,
  user_first_name character varying(100),
  user_last_name character varying(100),
  CONSTRAINT ers_users_pk PRIMARY KEY (ers_users_id),
  CONSTRAINT user_roles_fk FOREIGN KEY (ers_users_id)
      REFERENCES public.ers_user_roles (ers_user_role_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ers_users
  OWNER TO postgres;

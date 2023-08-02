ALTER TABLE employee
  ADD CONSTRAINT uk_name_surname UNIQUE (name, surname);

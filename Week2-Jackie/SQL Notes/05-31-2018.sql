
/* CREATE A SEQUENCE */
CREATE SEQUENCE MYTESTSEQ
MINVALUE 600
MAXVALUE 900
INCREMENT BY 5 -- Or INCREMENT BY -5
CACHE 5; -- Store in memory next 5 values

/* RUN A SEQUENCE */
SELECT MYTESTSEQ.NEXTVAL FROM DUAL;
-- RESULT:
    -- 600
    -- 605
    -- etc


-- Example how to use SEQUENCE:
-- INSERT INTO STUDENT(MYTESTSEQ.NEXTVAL, 'BOB');




/* CREATE A VIEW */
CREATE VIEW MYVIEW 
AS SELECT TITLE FROM ALBUM
UNION 
SELECT NAME FROM ARTIST;

/* RUN A VIEW */
SELECT * FROM MYVIEW;





/* CREATE A FUNCITON EXAMPLE: */
SELECT UNITPRICE FROM TRACK;


CREATE OR REPLACE FUNCTION CALC_TAX
(T_ID IN NUMBER, TAX IN NUMBER)
RETURN NUMBER AS
TOTAL_PRICE NUMBER(10,2); -- 10 numbers, 2 decimal places
BEGIN
SELECT UNITPRICE INTO TOTAL_PRICE -- Copy UNITPRICE column into a TOTAL_PRICE variable;
FROM TRACK WHERE TRACKID = T_ID; -- Copies from TRACK table
RETURN TOTAL_PRICE + (TOTAL_PRICE * TAX);
END;
/


SELECT CALC_TAX(1000, .05) FROM DUAL;
-- FUNCTION RETURNS ONLY 1 VALUE.


-- DOES NOT RUN
/* CREATE A STORED PROCEDURE */
CREATE OR REPLACE PROCEDURE MYFAKEPRO
(ID IN INT, NAME IN VARCHAR2) -- PARAMETER LIST
AS 
BEGIN
INSERT INTO SCHOOL VALUES(MYSEQ.NEXTVAL, NAME);
COMMIT;
END;
/

-- DOES NOT RUN
EXECUTE MYFAKEPRO(88, 'USF');


-- DOES NOT RUN
CREATE OR REPLACE PROCEDURE BEARPRO
(CAVE_NAME IN VARCHAR2, BEAR_NAME IN VARCHAR2, 
BEAR_BIRTHDATE IN DATE, CAVE_ID IN NUMBER)
AS
BEGIN
INSERT INTO CAVE VALUES(MYSEQ.NEXTVAL, CAVE_NAME);
INSERT INTO BEEHIVE VALUES(MYSEQ.NEXTVAL, 50);
INSERT INTO BEAR VALUES(MYSEQ.NEXTVAL, BEAR_NAME, BEAR_BIRTHDAY, 200, CAVE_ID);9
COMMIT;
END;
/

-- DOES NOT RUN
EXECUTE BEARPRO('WOO','PERT','1999-02-15',1);





SELECT * FROM INVOICE;






/* Function: Add 10 to TOTAL from INVOICE table */

CREATE OR REPLACE FUNCTION addten(total IN NUMBER)
RETURN NUMBER
IS
BEGIN
    RETURN total + 10;
END addten;
/

-- Call function
SELECT addten(TOTAL) FROM INVOICE;

-- Call function. 
SELECT addten(TOTAL) FROM INVOICE
WHERE TOTAL BETWEEN 1 AND 10;


/* Function: Add custom value to TOTAL from INVOICE tble*/

CREATE OR REPLACE FUNCTION addx(x IN NUMBER, total IN NUMBER)
RETURN NUMBER
IS
BEGIN
    RETURN total + x;
END addx;
/

SELECT addx(100, TOTAL) FROM INVOICE;

SELECT addx(100, TOTAL) FROM INVOICE
WHERE TOTAL BETWEEN 1 AND 10;








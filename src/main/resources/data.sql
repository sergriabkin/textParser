       INSERT INTO Text (ID, name)
       VALUES (11, 'Text1'),
              (12, 'Text2'),
              (13, 'Text3');


       INSERT INTO Sentence (ID , data , Text_ID) VALUES
              (111, 'Text1-1', 11),
              (112, 'Text2-1', 12),
              (113, 'Text3-1', 13),
              (114, 'Text1-2', 11),
              (115, 'Text2-2', 12),
              (116, 'Text3-2', 13);
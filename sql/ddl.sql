select * from testdb.board;

create table testdb.board (
      id bigint auto_increment
    , title varchar(50)
    , content text
    , primary key(id)
)
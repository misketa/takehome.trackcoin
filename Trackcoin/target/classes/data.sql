INSERT INTO users (user_id, name, lastname, username)
VALUES ( 1, 'milos', 'simic', 'milossimic@gmail.com');

INSERT INTO tokeni (token_id, tokenSymbol, price, aboveDollar)
VALUES ( 1, 'btc', 1, 1);

INSERT INTO token_user (user_id, token_id)
VALUES ( 1, 1);

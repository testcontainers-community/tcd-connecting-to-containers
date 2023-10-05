# Testcontainers Desktop - Connecting to multiple Containers of the Same Type

* Copy `prodcuts-postgres.toml` and `promotions-postgres.toml` into `$HOME/.config/testcontainers/services` directory.
* Run TestProductServiceApplication and TestPromotionServiceApplication from your IDE.

You should be able to connect to **products** and **promotions** databases from your IDE.

```shell
# products database
host: localhost
port: 15432
database: test
username: test
password: test

# promotions database
host: localhost
port: 25432
database: test
username: test
password: test
```
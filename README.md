# Testcontainers Desktop - Connecting to multiple Containers of the Same Type

This example shows how to connect to multiple containers of the same type.

* Copy `prodcuts-postgres.toml` and `promotions-postgres.toml` into `$HOME/.config/testcontainers/services` directory.
* Run TestProductServiceApplication and TestPromotionServiceApplication from your IDE.

You should be able to connect to **products** and **promotions** databases from your IDE.

```shell
# products database
host: localhost
port: 15432
database: products
username: postgres
password: postgres

# promotions database
host: localhost
port: 25432
database: promotions
username: postgres
password: postgres
```
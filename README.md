# e-shop-be
## Mysql for Docker

```bash
docker run -it -e TZ='Europe/Istanbul' --name mysql8 -e MYSQL_ROOT_PASSWORD='root' -d -p 3306:3306 mysql:8.0.20 --character-set-server=utf8 --collation-server=utf8_general_ci --lower_case_table_names=1
```
## Swagger
```bash
http://localhost:8080/api/public/swagger-ui.html
```

## Default created data


### User Table
|username|name|surname|pass|role|permissions|
|:---:|:---:|---:|---|:---:|:---:|
|yk@gmail.com| Yasin| Kılınç|123123|ROLE_ADMIN|VIEW_PROFILE,VIEW_DASHBOARD



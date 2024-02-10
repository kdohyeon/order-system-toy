# TEST

## 요구사항

- 특정 매장으로부터 상품을 주문할 수 있다.
- 주문을 할 땐 최소 하나 이상의 상품을 골라야 한다.
- 재고가 없다면 주문할 수 없다.
- 참고: https://newedge.tistory.com/173
  - 스타벅스 사이렌 오더

## 도메인

### 주문 (Order)

- 사용자는 원하는 수량만큼 상품을 주문할 수 있다.
- 주문을 할 땐, 특정 매장을 지정해야 한다. (재고)
- 하나 이상의 상품을 주문할 때, 주문을 만들 수 있다.

### 고객 (Customer)

- 주문을 하기 위해서는 미리 회원가입이 되어 있어야 한다.
- 회원은 이름, 주소, 전화번호가 필요하다.

### 매장 (Store)

- 매장을 등록할 수 있다.
- 매장은 이름, 주소, 전화번호, 오픈-종료 시간이 필요하다.

### 상품 (Product)

- 상품을 등록할 수 있다.
- 상품은 이름, 설명, 그리고 가격을 등록해야 한다.

### 매장 별 상품

- 각 매장에는 판매할 수 있는 재고가 정해져있음
- 재고를 업데이트할 수 있어야 한다.
- 매장은 주문이 들어오면 매장에서 제공할 수 있는 재고가 존재하는지 확인한다.
  - 만약 주문 내 하나의 상품이라도 품절인 경우에는 주문을 취소한다.
  - 주문이 성공하면 매장 내 재고 개수를 조정한다.

## ERD

```mermaid

erDiagram
    Order ||--|{ OrderItem : contains
    Store ||--o{ StoreProduct : contains
    
    Product {
        int productId
        String name
        String description
        BigDecimal price
    }
    
    Order {
        int orderId
        int customerId
        ZonedDateTime orderedAt
    }
    
    Store {
        int storeId
        String name
        String address
        String phoneNumber
        ZonedDateTime openAt
        ZonedDateTime closeAt
    }
    
    Customer {
        int customerId
        String name
        String phoneNumber
        String address
    }
    
    OrderItem {
        int orderItemId
        int orderId
        int productId
        int orderQuantity
    }
    
    StoreProduct {
        int storeProductId
        int storeId
        int productId
        int stockQuantity
    }
```

## Local MySQL

```
# mysql image 가져오기
$ docker pull mysql

# docker run
$ docker run --name localmysql -e MYSQL_ROOT_PASSWORD=coffee -p 3306:3306 -d mysql:latest
```

package com.bbong.api.buy.domain;

/**
 * packageName: com.bbong.api.buy.domain
 * fileName        : BuyDTO
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
public class BuyDTO{
    private int num;
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private int amount;

    public final static BuyDTO buyDTO=new BuyDTO();
    private BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}


    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



}

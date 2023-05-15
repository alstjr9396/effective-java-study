package me.minseok.effectivejava.chapter15.item;

import me.minseok.effectivejava.chapter15.member.MemberService;

public class ItemService {

    public static final String PACKAGE_NAME = "MINSEOK";

    // private와 package-private는 내부 구현
    private MemberService memberService;

    boolean onSale;

    // public 클래스의 protected와 public은 공개 api
    protected int saleRate;

    public ItemService(MemberService memberService) {
        if (memberService == null) {
            throw new IllegalArgumentException("MemberService should not be null.");
        }

        this.memberService = memberService;
    }

    MemberService getMemberService() {
        return memberService;
    }
}

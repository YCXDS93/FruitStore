package com.bwie.fruitsstore.home.model.bean;

import java.util.List;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/11 10:38
 */

public class HomeBean {
    public int banImage;
    public List<FirstBean> firstBeen;
    public List<SecondBean> secondBeen;
    public List<ThirdBean> thirdBeen;

    public int getBanImage() {
        return banImage;
    }

    public void setBanImage(int banImage) {
        this.banImage = banImage;
    }

    public List<FirstBean> getFirstBeen() {
        return firstBeen;
    }

    public void setFirstBeen(List<FirstBean> firstBeen) {
        this.firstBeen = firstBeen;
    }

    public List<SecondBean> getSecondBeen() {
        return secondBeen;
    }

    public void setSecondBeen(List<SecondBean> secondBeen) {
        this.secondBeen = secondBeen;
    }

    public List<ThirdBean> getThirdBeen() {
        return thirdBeen;
    }

    public void setThirdBeen(List<ThirdBean> thirdBeen) {
        this.thirdBeen = thirdBeen;
    }

    public static class FirstBean {
        public int firstImage;
        public String firstName;

        public int getFirstImage() {
            return firstImage;
        }

        public void setFirstImage(int firstImage) {
            this.firstImage = firstImage;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    }

    public static class SecondBean {
        public int secondImage;
        public String secondName;
        public String secondPrice;

        public int getSecondImage() {
            return secondImage;
        }

        public void setSecondImage(int secondImage) {
            this.secondImage = secondImage;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getSecondPrice() {
            return secondPrice;
        }

        public void setSecondPrice(String secondPrice) {
            this.secondPrice = secondPrice;
        }
    }

    public static class ThirdBean {

        public int thirdImage;
        public String thirdName;

        public int getThirdImage() {
            return thirdImage;
        }

        public void setThirdImage(int thirdImage) {
            this.thirdImage = thirdImage;
        }

        public String getThirdName() {
            return thirdName;
        }

        public void setThirdName(String thirdName) {
            this.thirdName = thirdName;
        }
    }
}

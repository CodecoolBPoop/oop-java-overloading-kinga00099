package com.codecool.uml.overloading;

import java.util.Date;

class FeaturedProductCategory extends ProductCategory{
    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate){}

    @Override
    public String toString() {
        return super.toString();
    }
}

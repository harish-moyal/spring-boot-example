package com.spring.boot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by harishmoyal on 11/03/16.
 */
public class AverageCostByTypeResponse implements Comparable<AverageCostByTypeResponse> {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("AverageCost")
    private BigDecimal averageCost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    @Override
    public int compareTo(AverageCostByTypeResponse o) {
        if (this.averageCost.compareTo(o.getAverageCost()) == 1) {
            return 1;
        }

        if (this.averageCost.compareTo(o.getAverageCost()) == -1) {
            return -1;
        }

        if (this.averageCost.compareTo(o.getAverageCost()) == 0) {
            return 0;
        }
        return 0;
    }
}

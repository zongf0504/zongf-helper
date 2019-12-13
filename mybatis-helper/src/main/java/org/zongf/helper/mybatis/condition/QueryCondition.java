package org.zongf.helper.mybatis.condition;

import java.util.List;

/** 查询条件
 * @author: zongf
 * @date: 2019-12-02
 */
public class QueryCondition<T extends Enum> extends UpdateCondition {

    // 是否去重
    private boolean distinct;

    // 查询字段名
    private List<T> fields;

    // 排序规则
    private List<SortRule> orderRules;

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<T> getFields() {
        return fields;
    }

    public void setFields(List<T> fields) {
        this.fields = fields;
    }

    public List<SortRule> getOrderRules() {
        return orderRules;
    }

    public void setOrderRules(List<SortRule> orderRules) {
        this.orderRules = orderRules;
    }
}






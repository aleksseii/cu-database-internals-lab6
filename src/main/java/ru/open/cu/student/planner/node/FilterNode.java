package ru.open.cu.student.planner.node;


/**
 * Логический узел Filter — фильтрация строк по предикату.
 */
public class FilterNode extends LogicalPlanNode {
    protected FilterNode(String nodeType) {
        super(nodeType);
    }
}

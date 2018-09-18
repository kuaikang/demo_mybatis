package com.example.page;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
public class Pagination implements Serializable{

    private static final long serialVersionUID = 5585187942830327188L;

    /**
     * 当前显示页
     */
    private Integer page;

    /**
     * 当前页记录数
     */
    private Integer rows;

    /**
     * 总记录数
     */
    private Long total;

    /** 排序字段名**/
    private String sortName;

    /** 排序**/
    private String sortOrder;

    public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public static Pagination generatePagination(List list) {
        Pagination pagination = new Pagination();
        PageInfo pageInfo = new PageInfo(list);
        pagination.setPage(pageInfo.getPageNum());
        pagination.setRows(pageInfo.getPageSize());
        pagination.setTotal(pageInfo.getTotal());
        return pagination;
    }
}

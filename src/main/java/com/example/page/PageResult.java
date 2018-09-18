package com.example.page;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -7600434612547513436L;

    /**
     * 本页包含的数据
     */
    private List<T> list;

    /**
     * 分页集
     */
    private Pagination pagination; 
    
	/**
	 *当前是否管理员登录
	 */
	private String isAdmin;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
    
    

}

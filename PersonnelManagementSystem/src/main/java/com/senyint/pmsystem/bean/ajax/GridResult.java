package com.senyint.pmsystem.bean.ajax;

public class GridResult {
	
	/**
	 * 当前页数,注意这是jqgrid自身的参数 
	 */
	private Integer page;
	
	/**
	 * 总页数
	 */
	private Long total;
	
	/**
	 * 总记录数,该属性值在get方法中计算得出
	 */
	private Long records;
	
	/**
	 * 要显示的数据行entity对象 
	 */
	private Object rows;
	
	/**
	 * 每页显示行数，,注意这是jqgrid自身的参数 
	 */
	private Integer pageSize;

	public GridResult() {

	}
	
	/**
	 * 
	* <p>Title: </p> 
	* <p>Description: </p> 
	* @param page	当前页数,注意这是jqgrid自身的参数 
	* @param pageSize	每页显示行数，,注意这是jqgrid自身的参数 
	* @param records	总记录数
	* @param rows	要显示的数据行entity对象 
	 */
	public GridResult(Integer page, Integer pageSize, Long records, Object rows) {
		this.page = page;
		this.pageSize = pageSize;
		this.records = records;
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Long getTotal() {
		this.total = (records - 1) / this.pageSize + 1;
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getRecords() {
		return records;
	}

	public void setRecords(Long records) {
		this.records = records;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "GridResult [page=" + page + ", total=" + total + ", records=" + records + ", rows=" + rows + ", pageSize=" + pageSize + "]";
	}
	
	
}

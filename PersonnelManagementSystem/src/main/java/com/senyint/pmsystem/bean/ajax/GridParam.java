package com.senyint.pmsystem.bean.ajax;

public class GridParam {

	public static final Integer DEFAULT_PAGE = 1;
	public static final Integer DEFAULT_ROWS = 10;

	/**
	 * pageNo 必须
	 */
	private Integer page;

	/**
	 * pageSize 必须
	 */
	private Integer rows;

	/**
	 * 开始行数
	 */
	private Integer startRow;

	/**
	 * 结束行数
	 */
	private Integer endRow;

	/**
	 * 排序列名	查询的数据包括查询字段数据等
	 */
	private String sidx;

	/**
	 * 排序方式 asc或desc
	 */
	private String sord;

	/**
	 * 查询数据
	 */
	private String filters;
	
	/**
	 * 查询标志
	 */
	private String _search;
	
	public GridParam() {

	}

	public GridParam(Integer page, Integer rows) {
		this.page = page;
		this.rows = rows;
	}

	public Integer getPage() {
		if (page == null) {
			page = DEFAULT_PAGE;
		}
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		if (rows == null) {
			rows = DEFAULT_ROWS;
		}
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getStartRow() {
		startRow = (page - 1) * rows;
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getEndRow() {
		endRow = page * rows;
		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	/**
	 * 排序列名
	 * 
	 * @return
	 */
	public String getSidx() {
		return sidx;
	}

	/**
	 * 排序列名
	 * 
	 * @param sidx
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	/**
	 * 排序方式 asc或desc
	 * 
	 * @return
	 */
	public String getSord() {
		return sord;
	}

	/**
	 * 排序方式 asc或desc
	 * 
	 * @param sord
	 */
	public void setSord(String sord) {
		this.sord = sord;
	}

	/*public String getOrderByStr() {
		if (StringUtils.isNotBlank(this.sidx)) {
			return this.sidx + " " + (StringUtils.isNotBlank(this.getSord()) ? this.getSord() : "");
		}

		return null;
	}*/

	/**
	 * 查询的数据包括查询字段数据等
	 * 
	 * @param filters
	 */
	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	/**
	 * 查询标志
	 * 
	 * @param _search
	 */
	public String get_search() {
		return _search;
	}

	public void set_search(String _search) {
		this._search = _search;
	}

	@Override
	public String toString() {
		return "GridParam [page=" + page + ", rows=" + rows + ", startRow=" + startRow + ", endRow=" + endRow + ", sidx=" + sidx + ", sord=" + sord + ", filters=" + filters + ", _search=" + _search + "]";
	}
	
	
}

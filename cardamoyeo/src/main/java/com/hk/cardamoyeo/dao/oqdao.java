package com.hk.cardamoyeo.dao;

import java.util.List;

import com.hk.cardamoyeo.dto.OQnaDto;

public interface oqdao {
	public int getCount();
	public List<OQnaDto> getAllList(String pNum, int pcount);
	public boolean OQuWrite(OQnaDto dto);
	public OQnaDto getOUBoard(OQnaDto dto);
	public OQnaDto getOUMBoard(int seq);
	public boolean OQUModify(OQnaDto dto);
	public boolean OQUDelete(int seqs);
}

package com.hk.cardamoyeo.dao;

import java.util.List;

import com.hk.cardamoyeo.dto.OReplyDto;

public interface ordao {
	//댓글 조회
	public List<OReplyDto> readOReply(int seq) throws Exception;
	//댓글 작성
	public boolean writeOReply(OReplyDto dto) throws Exception;
	//댓글 삭제
	public boolean deleteOReply(OReplyDto dto) throws Exception;
}

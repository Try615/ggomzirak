package com.ggomzirak.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ggomzirak.db.entity.Qna;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
/**
 * 꿀팁글 조회 API ([GET] /api/v1/tips/{id}) 요청에 대한 응답값 정의.
 */
@Getter
@Setter
@ApiModel("QnaResponse")
public class QnaRes{
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	@ApiModelProperty(name="qna")
	Qna qna;
	
	@ApiModelProperty(name="글 태그")
	List<String> tags;
	
	@ApiModelProperty(name="사진")
	List<String> images;

	@ApiModelProperty(name="댓글 수")
	Long comments;

	public QnaRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public QnaRes(Qna qna, List<String> tags,  List<String> images,Long comments)
	{
		this.qna = qna;
		this.tags = tags;
		this.images = images;
		this.comments=comments;
	}
}

package com.example.lent.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

/*Entity가 뭘까요?*/
@RequiredArgsConstructor
@Getter
public class LentHistory {
	private final Long lentHistoryId;
	private final Long cabinetId;
	private final String lentUserName;
	private final LocalDateTime createdAt;
	private final LocalDateTime expiredAt;
}

package com.example.lent.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*Entity가 뭘까요?*/
@RequiredArgsConstructor
@Getter
public class Cabinet {
	private final Long cabinetId;
	private final CabinetStatus cabinetStatus;
}

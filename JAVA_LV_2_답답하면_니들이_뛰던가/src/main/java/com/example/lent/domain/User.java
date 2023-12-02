package com.example.lent.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*Entity가 뭘까요?*/
@Getter
@RequiredArgsConstructor
public class User {
	private final Long userId;
	private final String name;
	private final boolean isBanned;
}

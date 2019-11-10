package com.wallet.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserWalletDTO {

	private Long id;
	@NotNull(message = "Informe o usuário")
	private Long users;
	@NotNull(message = "Informe a carteira")
	private Long wallet;
}

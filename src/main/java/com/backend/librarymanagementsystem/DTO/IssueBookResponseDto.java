package com.backend.librarymanagementsystem.DTO;

import com.backend.librarymanagementsystem.Enum.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IssueBookResponseDto {
     private String tansactionId;
     private String bookName;

     private TransactionStatus transactionStatus;


}

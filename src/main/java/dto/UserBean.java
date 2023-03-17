package dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserBean 
{
private String name,email,mobile,pass;
}

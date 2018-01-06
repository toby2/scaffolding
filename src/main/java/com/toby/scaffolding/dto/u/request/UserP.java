package com.toby.scaffolding.dto.u.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Toby on 2017/12/17.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserP {
    @NotEmpty(message = "名字不能为空")
    private String name;
    @NotEmpty(message = "地址不能为空")
    private String adress;

    //高中学校名称
    private String high_school_name;
    //中学名称
    private String middle_school_name;
    //大学名称
    private String university_name;
}

package com.toby.scaffolding.dto.u.in;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Toby on 2017/12/17.
 */

@Data
@Builder
public class UserIn {
    @NotEmpty
    private String name;
    @NotEmpty
    private String adress;

    //高中学校名称
    private String high_school_name;
    //中学名称
    private String middle_school_name;
    //大学名称
    private String university_name;
}

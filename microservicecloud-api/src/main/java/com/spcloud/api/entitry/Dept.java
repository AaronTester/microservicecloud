package com.spcloud.api.entitry;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/29
 */
@Data
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Accessors(chain = true)
public class Dept implements Serializable {
    public Long deptId;
    public String deptName;
    public String data_source;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}

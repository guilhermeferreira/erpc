/*!
 * Copyright (c) 2014-2015, Freescale Semiconductor, Inc.
 * Copyright 2016 NXP
 * All rights reserved.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/** 
 * Generated by erpcgen 1.12.0 on Mon Jan  8 10:25:43 2024.
 * 
 * AUTOGENERATED - DO NOT EDIT
 */

package io.github.embeddedrpc.erpc.tests.test_arrays.test_unit_test_common.common.enums;

import io.github.embeddedrpc.erpc.codec.Codec;

public enum numbers{
    one(1), 
    two(2), 
    three(3), 
    four(4); 

    private final Integer value;

    numbers(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static numbers get(int value) {
        if (value == 1) {
            return one;
        }
        
        if (value == 2) {
            return two;
        }
        
        if (value == 3) {
            return three;
        }
        
        if (value == 4) {
            return four;
        }
        
        return null;
    }

    public static numbers read(Codec codec) {
        return get(codec.readInt32());
    }

    public void write(Codec codec) {
        codec.writeInt32(this.getValue());
    }
}
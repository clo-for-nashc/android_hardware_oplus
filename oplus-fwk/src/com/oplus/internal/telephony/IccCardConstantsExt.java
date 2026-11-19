/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.internal.telephony;

public class IccCardConstantsExt {
    public enum CardType {
        SIM_CARD,
        USIM_CARD,
        UIM_CARD,
        UNKNOW_CARD;

        public boolean is4GCard() {
            return true;
        }
    }
}

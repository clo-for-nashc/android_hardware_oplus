/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.internal.telephony;

public class OplusPhoneInterFaceExt {
    private static final OplusPhoneInterFaceExt sInstance = new OplusPhoneInterFaceExt();

    public static OplusPhoneInterFaceExt getDefault() {
        return sInstance;
    }

    public boolean isCapabilitySwitching() {
        return false;
    }

    public IccCardConstantsExt.CardType getCdmaCardType(int slotId) {
        return IccCardConstantsExt.CardType.SIM_CARD;
    }
}

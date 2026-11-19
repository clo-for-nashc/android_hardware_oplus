/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.telephony;

import android.content.Context;

public class SubscriptionManagerExt {
    private static SubscriptionManagerExt sInstance = null;

    public static SubscriptionManagerExt from(Context context) {
        if (sInstance == null) {
            sInstance = new SubscriptionManagerExt();
        }
        return sInstance;
    }

    public String getIsimImpiForSubscriber(int subId) {
        return null;
    }
}

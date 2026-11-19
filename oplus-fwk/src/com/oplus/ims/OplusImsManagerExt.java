/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.oplus.ims;

import android.content.Context;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

public class OplusImsManagerExt {
    private Context mContext;

    public OplusImsManagerExt(Context context) {
        mContext = context;
    }

    public boolean isFeatureEnabledByPlatform(Context context, int feature, int phoneId) {
        return true;
    }

    public boolean isFeatureProvisionedOnDevice(int feature, int phoneId) {
        return true;
    }

    public static boolean isEntitlementEnabled() {
        return false;
    }

    public static boolean isMccMncReady(int phoneId) {
        return true;
    }

    public static boolean isOp15Card(int phoneId) {
        return false;
    }

    public boolean getBooleanCarrierConfig(String key, int phoneId) {
        return false;
    }

    public static String getSimOperatorNumericForPhone(int phoneId) {
        int subId = getSubIdUsingPhoneId(phoneId);
        TelephonyManager tm = TelephonyManager.getDefault();
        if (tm != null) {
            return tm.getSimOperatorNumeric(subId);
        }
        return "";
    }

    public static int getSubIdUsingPhoneId(int phoneId) {
        int[] subIds = SubscriptionManager.getSubId(phoneId);
        if (subIds != null && subIds.length > 0) {
            return subIds[0];
        }
        return SubscriptionManager.getDefaultSubscriptionId();
    }
}

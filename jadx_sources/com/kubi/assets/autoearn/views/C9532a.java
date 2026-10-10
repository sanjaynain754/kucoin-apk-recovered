package com.kubi.assets.autoearn.views;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.assets.autoearn.views.a */
/* JADX INFO: compiled from: AutoEarnEntryView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m90084d2 = {"toStyle", "Lcom/kubi/assets/autoearn/views/AutoEarnEntryView$Style;", "", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9532a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final AutoEarnEntryView.AbstractC9531a m15454b(String str) {
        switch (str.hashCode()) {
            case -1957249943:
                if (str.equals("OPENED")) {
                    return AutoEarnEntryView.AbstractC9531a.a.f16601a;
                }
                break;
            case -1103401190:
                if (str.equals("PARTIALLY_OPENED")) {
                    return AutoEarnEntryView.AbstractC9531a.c.f16603a;
                }
                break;
            case 1487498288:
                if (str.equals("UNAVAILABLE")) {
                    return AutoEarnEntryView.AbstractC9531a.d.f16604a;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    return AutoEarnEntryView.AbstractC9531a.b.f16602a;
                }
                break;
        }
        return AutoEarnEntryView.AbstractC9531a.b.f16602a;
    }
}

package com.geetest.captcha;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.a0 */
/* JADX INFO: loaded from: classes45.dex */
public enum EnumC6657a0 {
    FLOWING("-10"),
    SUCCESS("-11"),
    END("-12"),
    FAIL("-13"),
    CANCEL("-14"),
    NONE("-15");


    @NotNull
    private String type;

    /* JADX INFO: renamed from: com.geetest.captcha.a0$a */
    public enum a {
        FLOWING("-16"),
        SUCCESS("-17"),
        FAIL("-18"),
        NONE("-19");


        @NotNull
        private String type;

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final void setType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.type = str;
        }

        a(String str) {
            this.type = str;
        }
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    EnumC6657a0(String str) {
        this.type = str;
    }
}

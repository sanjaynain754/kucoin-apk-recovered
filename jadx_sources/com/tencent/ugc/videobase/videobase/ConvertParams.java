package com.tencent.ugc.videobase.videobase;

import com.tencent.liteav.base.util.EnumC34747l;

/* JADX INFO: loaded from: classes2.dex */
public class ConvertParams {
    public final int height;
    public final boolean mirror;
    public final EnumC34747l rotation;
    public final int width;

    public ConvertParams() {
        this(0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertParams)) {
            return false;
        }
        ConvertParams convertParams = (ConvertParams) obj;
        return convertParams.width == this.width && convertParams.height == this.height && convertParams.rotation == this.rotation && convertParams.mirror == this.mirror;
    }

    public ConvertParams(int i11, int i12) {
        this(i11, i12, EnumC34747l.NORMAL, false);
    }

    public int hashCode() {
        return (((this.width * 32713) + this.height) << 4) + (this.rotation.ordinal() << 1) + (this.mirror ? 1 : 0);
    }

    public ConvertParams(int i11, int i12, EnumC34747l enumC34747l, boolean z11) {
        this.width = i11;
        this.height = i12;
        this.rotation = enumC34747l == null ? EnumC34747l.NORMAL : enumC34747l;
        this.mirror = z11;
    }
}

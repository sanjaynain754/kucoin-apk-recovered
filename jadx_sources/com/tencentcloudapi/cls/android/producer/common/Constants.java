package com.tencentcloudapi.cls.android.producer.common;

/* JADX INFO: loaded from: classes2.dex */
public class Constants {

    /* JADX INFO: renamed from: a */
    public static int f77443a = 60000;

    /* JADX INFO: renamed from: b */
    public static int f77444b = 60000;

    /* JADX INFO: renamed from: c */
    public static final int f77445c = Math.max(Runtime.getRuntime().availableProcessors(), 1);

    public enum CompressType {
        NONE(""),
        LZ4("lz4"),
        GZIP("deflate");

        private String strValue;

        @Override // java.lang.Enum
        public String toString() {
            return this.strValue;
        }

        CompressType(String str) {
            this.strValue = str;
        }

        public static CompressType fromString(String str) {
            for (CompressType compressType : values()) {
                if (compressType.strValue.equals(str)) {
                    return compressType;
                }
            }
            throw new IllegalArgumentException("invalid CompressType: " + str + ", should be (" + NONE + ", " + GZIP + ", " + LZ4 + ")");
        }
    }
}

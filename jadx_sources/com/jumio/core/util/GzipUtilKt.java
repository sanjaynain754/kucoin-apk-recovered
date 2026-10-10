package com.jumio.core.util;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"toGzip", "", "", "fromGzip", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GzipUtilKt {
    @NotNull
    public static final byte[] toGzip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), Charsets.UTF_8), 8192);
            try {
                bufferedWriter.write(str);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedWriter, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedWriter, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @NotNull
    public static final byte[] fromGzip(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                ByteStreamsKt.copyTo$default(gZIPInputStream, byteArrayOutputStream, 0, 2, null);
                CloseableKt.closeFinally(gZIPInputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(gZIPInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @NotNull
    public static final byte[] toGzip(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(gZIPOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(gZIPOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }
}

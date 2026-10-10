package com.tencent.bugly.common.reporter.upload;

import com.jumio.commons.log.LogUtils;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.proguard.C33588ce;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.bugly.proguard.C33928t0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import javax.crypto.CipherOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ4\u0010\r\u001a\u00020\u000e2\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011`\u00122\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/FileUploadRunnable;", "Lcom/tencent/bugly/common/reporter/upload/ReporterUpload;", "url", "Ljava/net/URL;", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "(Ljava/net/URL;Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V", "buffer", "Ljava/lang/StringBuffer;", "uploadFile", "Ljava/io/File;", "buildHeader", "", "headers", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "encryptKey", "checkUploadAttachment", "", "checkUploadFile", "generateBoundary", "isEndBoundary", "generateContentDispositionForFile", "fileName", "generateContentDispositionForJson", "generateEmptyLine", "generateJsonContent", "", "request", "requestInternal", "upload", "", "connection", "Ljava/net/HttpURLConnection;", "writeBody", "dataOutputStream", "Ljava/io/DataOutputStream;", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class FileUploadRunnable extends ReporterUpload {

    @NotNull
    private static final String BOUNDARY = "27182818284590452353602874713526";

    @NotNull
    private static final String TAG = "RMonitor_report_File";

    @NotNull
    private final StringBuffer buffer;

    @Nullable
    private File uploadFile;

    private final void buildHeader(HashMap<String, String> headers, String encryptKey) {
        headers.put("Content-Type", "multipart/form-data; boundary=27182818284590452353602874713526");
        headers.put("Content-Encoding", "encrypt");
        if (!isEnableEncryptAttachment()) {
            headers.put("X-ENCRYPTION-KEY", encryptKey);
            headers.put("X-ENCRYPTION-VERSION", "v1");
        } else {
            headers.put("X-ENCRYPTION-KEY", UploadEncrypt.INSTANCE.getEncryptKey(encryptKey));
            headers.put("X-ENCRYPTION-KEY-ID", "c6c3fd0c");
            headers.put("X-ENCRYPTION-VERSION", "v2");
        }
    }

    private final String generateBoundary(boolean isEndBoundary) {
        StringBuffer stringBuffer = this.buffer;
        stringBuffer.delete(0, stringBuffer.length());
        if (isEndBoundary) {
            StringBuffer stringBuffer2 = this.buffer;
            stringBuffer2.append("--");
            stringBuffer2.append(BOUNDARY);
            stringBuffer2.append("--\r\n");
        } else {
            StringBuffer stringBuffer3 = this.buffer;
            stringBuffer3.append("--");
            stringBuffer3.append(BOUNDARY);
            stringBuffer3.append(LogUtils.NEW_LINE);
        }
        String string = this.buffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    private final String generateContentDispositionForFile(String fileName) {
        StringBuffer stringBuffer = this.buffer;
        stringBuffer.delete(0, stringBuffer.length());
        if (getReportData().getReportType() == 1) {
            this.buffer.append("Content-Disposition: form-data; name=\"_file\"; filename=\"" + fileName + "\"\r\n");
        }
        String string = this.buffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    private final String generateContentDispositionForJson() {
        StringBuffer stringBuffer = this.buffer;
        stringBuffer.delete(0, stringBuffer.length());
        this.buffer.append("Content-Disposition: form-data; name=\"_json\"\r\n");
        String string = this.buffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    private final String generateEmptyLine() {
        return LogUtils.NEW_LINE;
    }

    private final byte[] generateJsonContent(String encryptKey) {
        StringBuffer stringBuffer = this.buffer;
        stringBuffer.delete(0, stringBuffer.length());
        this.buffer.append(getReportData().getParams().toString());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            String string = this.buffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
            Charset charsetForName = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = string.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            UploadEncrypt.Companion companion = UploadEncrypt.INSTANCE;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
            byte[] bArrDoUploadEncrypt = companion.doUploadEncrypt(byteArray, encryptKey);
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return bArrDoUploadEncrypt;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    private final void requestInternal() {
        HashMap<String, String> map = new HashMap<>();
        String strCreateEncryptKey = UploadEncrypt.INSTANCE.createEncryptKey();
        buildHeader(map, strCreateEncryptKey);
        C33864ph.m74587a("file", getUrl().toString(), getReportData());
        HttpURLConnection httpURLConnectionConnectionBuilder = connectionBuilder(map, getReportData().getReportStrategy().getConnectTimeout(), getReportData().getReportStrategy().getReadTimeout());
        try {
            try {
                try {
                    upload(httpURLConnectionConnectionBuilder, strCreateEncryptKey);
                    if (httpURLConnectionConnectionBuilder == null) {
                        return;
                    }
                } catch (Exception e11) {
                    Logger.INSTANCE.mo77131e(TAG, e11.toString());
                    C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 603, e11.getMessage(), 0);
                    if (httpURLConnectionConnectionBuilder == null) {
                        return;
                    }
                } catch (OutOfMemoryError e12) {
                    C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 600, e12.getMessage(), 0);
                    if (httpURLConnectionConnectionBuilder == null) {
                        return;
                    }
                }
            } catch (FileNotFoundException e13) {
                Logger logger = Logger.INSTANCE;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e13);
                sb2.append(": ");
                File file = this.uploadFile;
                sb2.append(file != null ? file.getPath() : null);
                sb2.append(" not found");
                logger.mo77131e(TAG, sb2.toString());
                C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 601, e13.getMessage(), 0);
                if (httpURLConnectionConnectionBuilder == null) {
                    return;
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(TAG, th2.toString());
                C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 700, th2.getMessage(), 0);
                if (httpURLConnectionConnectionBuilder == null) {
                    return;
                }
            }
            httpURLConnectionConnectionBuilder.disconnect();
        } catch (Throwable th3) {
            if (httpURLConnectionConnectionBuilder != null) {
                httpURLConnectionConnectionBuilder.disconnect();
            }
            throw th3;
        }
    }

    private final int upload(HttpURLConnection connection, String encryptKey) {
        if (connection == null) {
            return 0;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
        try {
            writeBody(dataOutputStream, encryptKey);
            int size = dataOutputStream.size();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(dataOutputStream, null);
            dealResp(readResp(TAG, connection), connection.getResponseCode(), size);
            return size;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(dataOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploadRunnable(@NotNull URL url, @NotNull ReportData reportData, @Nullable IReporter.ReportCallback reportCallback) {
        super(url, reportData, reportCallback);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.buffer = new StringBuffer(512);
    }

    private final boolean checkUploadAttachment() {
        if (getReportData().getAttachmentInfo() != null) {
            return true;
        }
        return false;
    }

    private final boolean checkUploadFile() {
        String uploadFilePath = getReportData().getUploadFilePath();
        if (uploadFilePath.length() == 0) {
            return false;
        }
        File file = new File(uploadFilePath);
        this.uploadFile = file;
        Intrinsics.checkNotNull(file);
        if (!file.exists()) {
            return false;
        }
        return true;
    }

    private final void writeBody(DataOutputStream dataOutputStream, String encryptKey) throws IOException {
        boolean z11;
        if (isEnableEncryptAttachment()) {
            Logger.INSTANCE.mo77132i(TAG, "encrypt is enabled");
            z11 = true;
        } else {
            Logger.INSTANCE.mo77132i(TAG, "encrypt is disabled");
            z11 = false;
        }
        if (getReportData().getAttachmentInfo() != null) {
            C33928t0 attachmentInfo = getReportData().getAttachmentInfo();
            Intrinsics.checkNotNull(attachmentInfo);
            ArrayList<C33928t0.a> arrayListM75014b = attachmentInfo.m75014b();
            Intrinsics.checkNotNullExpressionValue(arrayListM75014b, "reportData.getAttachment()!!.itemLists");
            for (C33928t0.a aVar : arrayListM75014b) {
                String strGenerateBoundary = generateBoundary(false);
                Charset charsetForName = Charset.forName("utf-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = strGenerateBoundary.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                dataOutputStream.write(bytes);
                String str = aVar.f72024b;
                Intrinsics.checkNotNullExpressionValue(str, "it.fileName");
                String strGenerateContentDispositionForFile = generateContentDispositionForFile(str);
                Charset charsetForName2 = Charset.forName("utf-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strGenerateContentDispositionForFile.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                dataOutputStream.write(bytes2);
                String strGenerateEmptyLine = generateEmptyLine();
                Charset charsetForName3 = Charset.forName("utf-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName3, "forName(charsetName)");
                byte[] bytes3 = strGenerateEmptyLine.getBytes(charsetForName3);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                dataOutputStream.write(bytes3);
                if (z11) {
                    UploadEncrypt.Companion companion = UploadEncrypt.INSTANCE;
                    byte[] bArr = aVar.f72025c;
                    Intrinsics.checkNotNullExpressionValue(bArr, "it.data");
                    ByteArrayOutputStream byteArrayOutputStreamEncryptData = companion.encryptData(bArr, encryptKey);
                    dataOutputStream.write(byteArrayOutputStreamEncryptData.toByteArray());
                    byteArrayOutputStreamEncryptData.close();
                } else {
                    dataOutputStream.write(aVar.f72025c);
                }
                String strGenerateEmptyLine2 = generateEmptyLine();
                Charset charsetForName4 = Charset.forName("utf-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName4, "forName(charsetName)");
                byte[] bytes4 = strGenerateEmptyLine2.getBytes(charsetForName4);
                Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                dataOutputStream.write(bytes4);
            }
            String strGenerateBoundary2 = generateBoundary(false);
            Charset charsetForName5 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName5, "forName(charsetName)");
            byte[] bytes5 = strGenerateBoundary2.getBytes(charsetForName5);
            Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes5);
            String strGenerateContentDispositionForJson = generateContentDispositionForJson();
            Charset charsetForName6 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName6, "forName(charsetName)");
            byte[] bytes6 = strGenerateContentDispositionForJson.getBytes(charsetForName6);
            Intrinsics.checkNotNullExpressionValue(bytes6, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes6);
            String strGenerateEmptyLine3 = generateEmptyLine();
            Charset charsetForName7 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName7, "forName(charsetName)");
            byte[] bytes7 = strGenerateEmptyLine3.getBytes(charsetForName7);
            Intrinsics.checkNotNullExpressionValue(bytes7, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes7);
            dataOutputStream.write(generateJsonContent(encryptKey));
            Charset charsetForName8 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName8, "forName(charsetName)");
            byte[] bytes8 = LogUtils.NEW_LINE.getBytes(charsetForName8);
            Intrinsics.checkNotNullExpressionValue(bytes8, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes8);
            String strGenerateBoundary3 = generateBoundary(true);
            Charset charsetForName9 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName9, "forName(charsetName)");
            byte[] bytes9 = strGenerateBoundary3.getBytes(charsetForName9);
            Intrinsics.checkNotNullExpressionValue(bytes9, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes9);
            dataOutputStream.close();
            return;
        }
        if (this.uploadFile != null) {
            String strGenerateBoundary4 = generateBoundary(false);
            Charset charsetForName10 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName10, "forName(charsetName)");
            byte[] bytes10 = strGenerateBoundary4.getBytes(charsetForName10);
            Intrinsics.checkNotNullExpressionValue(bytes10, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes10);
            File file = this.uploadFile;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "uploadFile!!.name");
            String strGenerateContentDispositionForFile2 = generateContentDispositionForFile(name);
            Charset charsetForName11 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName11, "forName(charsetName)");
            byte[] bytes11 = strGenerateContentDispositionForFile2.getBytes(charsetForName11);
            Intrinsics.checkNotNullExpressionValue(bytes11, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes11);
            String strGenerateEmptyLine4 = generateEmptyLine();
            Charset charsetForName12 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName12, "forName(charsetName)");
            byte[] bytes12 = strGenerateEmptyLine4.getBytes(charsetForName12);
            Intrinsics.checkNotNullExpressionValue(bytes12, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes12);
            if (z11) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, UploadEncrypt.INSTANCE.buildCipher(encryptKey, 1));
                FileInputStream fileInputStream = new FileInputStream(this.uploadFile);
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i11 = fileInputStream.read(bArr2);
                        if (i11 == -1) {
                            break;
                        } else {
                            cipherOutputStream.write(bArr2, 0, i11);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    cipherOutputStream.close();
                    dataOutputStream.write(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                FileInputStream fileInputStream2 = new FileInputStream(this.uploadFile);
                try {
                    ByteStreamsKt.copyTo(fileInputStream2, dataOutputStream, Math.min(fileInputStream2.available(), 1048576));
                    CloseableKt.closeFinally(fileInputStream2, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(fileInputStream2, th4);
                        throw th5;
                    }
                }
            }
            String strGenerateEmptyLine5 = generateEmptyLine();
            Charset charsetForName13 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName13, "forName(charsetName)");
            byte[] bytes13 = strGenerateEmptyLine5.getBytes(charsetForName13);
            Intrinsics.checkNotNullExpressionValue(bytes13, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes13);
            String strGenerateBoundary5 = generateBoundary(false);
            Charset charsetForName14 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName14, "forName(charsetName)");
            byte[] bytes14 = strGenerateBoundary5.getBytes(charsetForName14);
            Intrinsics.checkNotNullExpressionValue(bytes14, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes14);
            String strGenerateContentDispositionForJson2 = generateContentDispositionForJson();
            Charset charsetForName15 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName15, "forName(charsetName)");
            byte[] bytes15 = strGenerateContentDispositionForJson2.getBytes(charsetForName15);
            Intrinsics.checkNotNullExpressionValue(bytes15, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes15);
            String strGenerateEmptyLine6 = generateEmptyLine();
            Charset charsetForName16 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName16, "forName(charsetName)");
            byte[] bytes16 = strGenerateEmptyLine6.getBytes(charsetForName16);
            Intrinsics.checkNotNullExpressionValue(bytes16, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes16);
            dataOutputStream.write(generateJsonContent(encryptKey));
            Charset charsetForName17 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName17, "forName(charsetName)");
            byte[] bytes17 = LogUtils.NEW_LINE.getBytes(charsetForName17);
            Intrinsics.checkNotNullExpressionValue(bytes17, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes17);
            String strGenerateBoundary6 = generateBoundary(true);
            Charset charsetForName18 = Charset.forName("utf-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName18, "forName(charsetName)");
            byte[] bytes18 = strGenerateBoundary6.getBytes(charsetForName18);
            Intrinsics.checkNotNullExpressionValue(bytes18, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes18);
            dataOutputStream.close();
        }
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
        if (whetherBlock()) {
            C33864ph.m74585a(getCallback(), C33864ph.f71457c, getReportData(), 0, null, 0);
            return;
        }
        if (!NetworkWatcher.INSTANCE.isNetworkConnectedRealtime()) {
            C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 602, "network not available", 0);
        } else if (!checkUploadFile() && !checkUploadAttachment()) {
            C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 601, "no upload content", 0);
        } else {
            C33588ce.m72684b().m72689b(getReportData().getParams());
            requestInternal();
        }
    }
}

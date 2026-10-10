package com.facebook.react.devsupport;

import androidx.annotation.Nullable;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import org.json.JSONException;
import org.json.JSONObject;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class BundleDownloader {
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    private static final String TAG = "BundleDownloader";
    private final OkHttpClient mClient;

    @Nullable
    private Call mDownloadBundleFromURLCall;

    public static class BundleInfo {
        private int mFilesChangedCount;

        @Nullable
        private String mUrl;

        @Nullable
        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException e11) {
                C45999a.m101508n(BundleDownloader.TAG, "Invalid bundle info: ", e11);
                return null;
            }
        }

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            String str = this.mUrl;
            return str != null ? str : "unknown";
        }

        @Nullable
        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e11) {
                C45999a.m101508n(BundleDownloader.TAG, "Can't serialize bundle info: ", e11);
                return null;
            }
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, @Nullable BundleInfo bundleInfo) {
        downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, new Request.Builder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBundleResult(String str, int i11, Headers headers, BufferedSource bufferedSource, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        if (i11 != 200) {
            String utf8 = bufferedSource.readUtf8();
            DebugServerException debugServerException = DebugServerException.parse(str, utf8);
            if (debugServerException != null) {
                devBundleDownloadListener.onFailure(debugServerException);
                return;
            }
            devBundleDownloadListener.onFailure(new DebugServerException("The development server returned response error code: " + i11 + "\n\nURL: " + str + "\n\nBody:\n" + utf8));
            return;
        }
        if (bundleInfo != null) {
            populateBundleInfo(str, headers, bundleInfo);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!storePlainJSInFile(bufferedSource, file2) || file2.renameTo(file)) {
            devBundleDownloadListener.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMultipartResponse(final String str, final Response response, String str2, final File file, @Nullable final BundleInfo bundleInfo, final DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        if (new MultipartStreamReader(response.body().getSource(), str2).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader.2
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> map, long j11, long j12) {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (j11 / 1024)), Integer.valueOf((int) (j12 / 1024)));
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z11) throws IOException {
                String string;
                Integer numValueOf;
                if (z11) {
                    int iCode = response.code();
                    if (map.containsKey("X-Http-Status")) {
                        iCode = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str, iCode, Headers.m94722of(map), buffer, file, bundleInfo, devBundleDownloadListener);
                    return;
                }
                if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                        if (jSONObject.has("status")) {
                            string = jSONObject.getString("status");
                        } else {
                            string = "Bundling";
                        }
                        Integer numValueOf2 = null;
                        if (jSONObject.has("done")) {
                            numValueOf = Integer.valueOf(jSONObject.getInt("done"));
                        } else {
                            numValueOf = null;
                        }
                        if (jSONObject.has("total")) {
                            numValueOf2 = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener.onProgress(string, numValueOf, numValueOf2);
                    } catch (JSONException e11) {
                        C45999a.m101507m(ReactConstants.TAG, "Error parsing progress JSON. " + e11.toString());
                    }
                }
            }
        })) {
            return;
        }
        devBundleDownloadListener.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.code() + "\n\nURL: " + str.toString() + "\n\n"));
    }

    public void downloadBundleFromURL(final DevBundleDownloadListener devBundleDownloadListener, final File file, String str, @Nullable final BundleInfo bundleInfo, Request.Builder builder) {
        Call call = (Call) C38115a.m86047c(this.mClient.newCall(builder.url(str).addHeader("Accept", "multipart/mixed").build()));
        this.mDownloadBundleFromURLCall = call;
        FirebasePerfOkHttpClient.enqueue(call, new Callback() { // from class: com.facebook.react.devsupport.BundleDownloader.1
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.getCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String url = call2.request().url().getUrl();
                devBundleDownloadListener.onFailure(DebugServerException.makeGeneric(url, "Could not connect to development server.", "URL: " + url, iOException));
            }

            /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:61:? A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v1 */
            /* JADX WARN: Type inference failed for: r9v17, types: [okhttp3.Response] */
            /* JADX WARN: Type inference failed for: r9v18, types: [okhttp3.Response] */
            /* JADX WARN: Type inference failed for: r9v19 */
            /* JADX WARN: Type inference failed for: r9v2, types: [okhttp3.Response] */
            /* JADX WARN: Type inference failed for: r9v20 */
            /* JADX WARN: Type inference failed for: r9v21 */
            /* JADX WARN: Type inference failed for: r9v22 */
            /* JADX WARN: Type inference failed for: r9v5, types: [okhttp3.Call] */
            /* JADX WARN: Type inference failed for: r9v6 */
            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) throws Throwable {
                ?? r11;
                Throwable th2;
                ?? r12;
                try {
                    r11 = BundleDownloader.this.mDownloadBundleFromURLCall;
                    try {
                        if (r11 == 0 || BundleDownloader.this.mDownloadBundleFromURLCall.getCanceled()) {
                            BundleDownloader.this.mDownloadBundleFromURLCall = null;
                            if (response != null) {
                                response.close();
                                return;
                            }
                            return;
                        }
                        BundleDownloader.this.mDownloadBundleFromURLCall = null;
                        String url = response.request().url().getUrl();
                        Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
                        if (matcher.find()) {
                            try {
                                BundleDownloader.this.processMultipartResponse(url, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                                r12 = response;
                            } catch (Throwable th3) {
                                th = th3;
                                r11 = response;
                                th2 = th;
                                if (r11 != 0) {
                                    throw th2;
                                }
                                try {
                                    r11.close();
                                    throw th2;
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                    throw th2;
                                }
                            }
                        } else {
                            r11 = response;
                            ResponseBody responseBodyBody = r11.body();
                            try {
                                BundleDownloader.this.processBundleResult(url, r11.code(), r11.headers(), r11.body().getSource(), file, bundleInfo, devBundleDownloadListener);
                                r12 = r11;
                                if (responseBodyBody != null) {
                                    responseBodyBody.close();
                                    r12 = r11;
                                }
                            } catch (Throwable th5) {
                                if (responseBodyBody == null) {
                                    throw th5;
                                }
                                try {
                                    responseBodyBody.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        }
                        r12.close();
                    } catch (Throwable th7) {
                        th = th7;
                        th2 = th;
                        if (r11 != 0) {
                            throw th2;
                        }
                        r11.close();
                        throw th2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r11 = response;
                }
            }
        });
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    private static void populateBundleInfo(String str, Headers headers, BundleInfo bundleInfo) {
        bundleInfo.mUrl = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = -2;
            }
        }
    }

    private static boolean storePlainJSInFile(BufferedSource bufferedSource, File file) throws Throwable {
        Sink sink;
        try {
            sink = Okio.sink(file);
            try {
                bufferedSource.readAll(sink);
                if (sink != null) {
                    sink.close();
                    return true;
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (sink != null) {
                    sink.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            sink = null;
        }
    }
}

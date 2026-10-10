package com.tencent.ugc.videoprocessor.watermark;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPaster;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatedPasterFilterChain extends PasterBase {
    private static final String TAG = "AnimatedPasterFilterChain";
    private List<TXVideoEditConstants.TXAnimatedPaster> mAnimatedPasterList;
    private CopyOnWriteArrayList<AnimatedPaster> mNormalizedList = new CopyOnWriteArrayList<>();

    private TXVideoEditConstants.TXAnimatedPaster construct(TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster, TXVideoEditConstants.TXRect tXRect) {
        TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster2 = new TXVideoEditConstants.TXAnimatedPaster();
        tXAnimatedPaster2.frame = tXRect;
        tXAnimatedPaster2.animatedPasterPathFolder = tXAnimatedPaster.animatedPasterPathFolder;
        tXAnimatedPaster2.startTime = tXAnimatedPaster.startTime;
        tXAnimatedPaster2.endTime = tXAnimatedPaster.endTime;
        tXAnimatedPaster2.rotation = tXAnimatedPaster.rotation;
        return tXAnimatedPaster2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3 */
    private String parseJsonFromFile(String str) throws Throwable {
        IOException e11;
        BufferedReader bufferedReader;
        String str2 = "";
        ?? r11 = 0;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str2 = str2 + line;
                    } catch (IOException e12) {
                        e11 = e12;
                        LiteavLog.m76084e(TAG, "read file failed.", e11);
                        if (bufferedReader != null) {
                        }
                        return str2;
                    }
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
                r11 = str;
                if (r11 != 0) {
                    try {
                        r11.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e13) {
            e11 = e13;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
        try {
            bufferedReader.close();
        } catch (IOException unused2) {
        }
        return str2;
    }

    private AnimatedPasterJsonConfig parsePaster(String str) throws Throwable {
        String jsonFromFile = parseJsonFromFile(str + AnimatedPasterJsonConfig.FILE_NAME);
        if (TextUtils.isEmpty(jsonFromFile)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonFromFile);
            AnimatedPasterJsonConfig animatedPasterJsonConfig = new AnimatedPasterJsonConfig();
            try {
                animatedPasterJsonConfig.mName = jSONObject.getString("name");
                animatedPasterJsonConfig.mCount = jSONObject.getInt("count");
                animatedPasterJsonConfig.mPeriod = jSONObject.getInt("period");
                animatedPasterJsonConfig.mWidth = jSONObject.getInt("width");
                animatedPasterJsonConfig.mHeight = jSONObject.getInt("height");
                animatedPasterJsonConfig.mKeyframe = jSONObject.getInt(AnimatedPasterJsonConfig.CONFIG_KEYFRAME);
                JSONArray jSONArray = jSONObject.getJSONArray(AnimatedPasterJsonConfig.CONFIG_KEYFRAME_ARRAY);
                for (int i11 = 0; i11 < animatedPasterJsonConfig.mCount; i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    AnimatedPasterJsonConfig.PasterPicture pasterPicture = new AnimatedPasterJsonConfig.PasterPicture();
                    pasterPicture.mPictureName = jSONObject2.getString("picture");
                    animatedPasterJsonConfig.mFrameArray.add(pasterPicture);
                }
            } catch (JSONException e11) {
                LiteavLog.m76084e(TAG, "failed to get value from json.", e11);
            }
            return animatedPasterJsonConfig;
        } catch (JSONException e12) {
            LiteavLog.m76084e(TAG, "parse invalid json string", e12);
            return null;
        }
    }

    public List<AnimatedPaster> getAnimatedPasterList() {
        return this.mNormalizedList;
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.PasterBase
    public void normalized(int i11, int i12, int i13) throws Throwable {
        int i14;
        int i15;
        List<TXVideoEditConstants.TXAnimatedPaster> list = this.mAnimatedPasterList;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<TXVideoEditConstants.TXAnimatedPaster> it = this.mAnimatedPasterList.iterator();
        while (it.hasNext()) {
            TXVideoEditConstants.TXAnimatedPaster next = it.next();
            if (next != null) {
                TXVideoEditConstants.TXAnimatedPaster tXAnimatedPasterConstruct = construct(next, calculateRect(i11, i12, i13, next.frame));
                AnimatedPasterJsonConfig paster = parsePaster(tXAnimatedPasterConstruct.animatedPasterPathFolder);
                if (paster != null && (i14 = paster.mCount) > 0) {
                    long j11 = tXAnimatedPasterConstruct.startTime;
                    long j12 = tXAnimatedPasterConstruct.endTime - j11;
                    int i16 = paster.mPeriod;
                    int i17 = i16 / i14;
                    int i18 = (int) (j12 / ((long) i16));
                    if (j12 % ((long) i16) > 0) {
                        i18++;
                    }
                    int i19 = 0;
                    while (i19 < i18) {
                        int i21 = 0;
                        while (true) {
                            if (i21 >= paster.mCount) {
                                i15 = i19;
                                break;
                            }
                            long j13 = ((long) i17) + j11;
                            i15 = i19;
                            if (j13 > tXAnimatedPasterConstruct.endTime) {
                                break;
                            }
                            AnimatedPasterJsonConfig.PasterPicture pasterPicture = paster.mFrameArray.get(i21);
                            AnimatedPaster animatedPaster = new AnimatedPaster();
                            animatedPaster.mPasterPath = tXAnimatedPasterConstruct.animatedPasterPathFolder + pasterPicture.mPictureName + ".png";
                            animatedPaster.mFrame = tXAnimatedPasterConstruct.frame;
                            animatedPaster.mStartTime = j11;
                            animatedPaster.mEndTime = j13;
                            animatedPaster.mRotation = tXAnimatedPasterConstruct.rotation;
                            this.mNormalizedList.add(animatedPaster);
                            j11 = animatedPaster.mEndTime;
                            i21++;
                            i19 = i15;
                            it = it;
                            paster = paster;
                        }
                        i19 = i15 + 1;
                        it = it;
                        paster = paster;
                    }
                }
            }
        }
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list, Size size) {
        this.mRenderSize = size;
        this.mAnimatedPasterList = list;
        this.mNormalizedList.clear();
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.PasterBase
    public void clear() {
        super.clear();
        this.mNormalizedList.clear();
        List<TXVideoEditConstants.TXAnimatedPaster> list = this.mAnimatedPasterList;
        if (list != null) {
            list.clear();
        }
        this.mAnimatedPasterList = null;
    }
}

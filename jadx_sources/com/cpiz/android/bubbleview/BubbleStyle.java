package com.cpiz.android.bubbleview;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public interface BubbleStyle {

    public enum ArrowDirection {
        None(-1),
        Auto(0),
        Left(1),
        Up(2),
        Right(3),
        Down(4);


        /* JADX INFO: renamed from: b */
        public static final SparseArray<ArrowDirection> f7131b = new SparseArray<>();
        private int mValue;

        static {
            for (ArrowDirection arrowDirection : values()) {
                f7131b.put(arrowDirection.mValue, arrowDirection);
            }
        }

        public static ArrowDirection valueOf(int i11) {
            ArrowDirection arrowDirection = f7131b.get(i11);
            return arrowDirection == null ? Auto : arrowDirection;
        }

        public int getValue() {
            return this.mValue;
        }

        public boolean isDown() {
            return this == Down;
        }

        public boolean isLeft() {
            return this == Left;
        }

        public boolean isRight() {
            return this == Right;
        }

        public boolean isUp() {
            return this == Up;
        }

        ArrowDirection(int i11) {
            this.mValue = i11;
        }
    }

    public enum ArrowPosPolicy {
        TargetCenter(0),
        SelfCenter(1),
        SelfBegin(2),
        SelfEnd(3);


        /* JADX INFO: renamed from: b */
        public static final SparseArray<ArrowPosPolicy> f7133b = new SparseArray<>();
        private int mValue;

        static {
            for (ArrowPosPolicy arrowPosPolicy : values()) {
                f7133b.put(arrowPosPolicy.mValue, arrowPosPolicy);
            }
        }

        public static ArrowPosPolicy valueOf(int i11) {
            ArrowPosPolicy arrowPosPolicy = f7133b.get(i11);
            return arrowPosPolicy == null ? TargetCenter : arrowPosPolicy;
        }

        public int getValue() {
            return this.mValue;
        }

        ArrowPosPolicy(int i11) {
            this.mValue = i11;
        }
    }

    ArrowDirection getArrowDirection();

    float getArrowHeight();

    void setArrowDirection(ArrowDirection arrowDirection);

    void setArrowPosDelta(float f11);

    void setArrowPosPolicy(ArrowPosPolicy arrowPosPolicy);

    void setArrowTo(View view);
}

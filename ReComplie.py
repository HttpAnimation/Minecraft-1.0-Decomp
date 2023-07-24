import #Import only if not previously imported
import cv2
import numpy as np
contours, hierarchy = cv2.findContours(, cv2.retrievalMode, cv2.approximation method)
for cnt in contours:
    approx = cv2.approxPolyDP(cnt, epsilonValue, Boolean(True if closed polygon))
    cv2.drawContours(Image, [approx], 0, (0,255,0), Thickness)
    x,y = approx[0][0]
    print("Gettings thickness")
    if len(approx) == 3:
        cv2.putText(Image, "Triangle", (x, y), cv2.FONT_HERSHEY_SIMPLEX, FontScale, (0,255,0),thickness)
    elif len(approx) == 4:
        cv2.putText(Image, "Rectangle", (x, y), cv2.FONT_HERSHEY_SIMPLEX, FontScale, (0,255,0),thickness)
    elif len(approx) == 5:
        cv2.putText(Image, "Pentagon", (x, y), cv2.FONT_HERSHEY_SIMPLEX, FontScale, (0,255,0),thickness)
    else:
        cv2.putText(Image, "Closed Polygon", (x, y), cv2.FONT_HERSHEY_SIMPLEX, FontScale, (0,255,0),thickness)
        print("Recomplied")

        import html
        import time
        console.timeEnd(contours);
/*
 * @author Dongmin.lee
 * @since 2023-03-13
 * @version 23.03.13
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.egovframework.javaservice.treeframework.errors.exception;

import com.egovframework.javaservice.treeframework.errors.response.ErrorCode;

/**
* EntityNotFoundException : Entity를 찾을 수 없을 때 Exception을 떨군다.
*
* @author MZC01-DJSHIN
* @version 1.0, 작업 내용
 * 2022-08-25 클래스 정의
* 작성일 2022-08-25
**/
public class IDNotFoundException extends BaseException{
    public IDNotFoundException() {
        super(ErrorCode.COMMON_ID_NOT_FOUND);
    }

    public IDNotFoundException(String message) {
        super(message, ErrorCode.COMMON_ID_NOT_FOUND);
    }
}

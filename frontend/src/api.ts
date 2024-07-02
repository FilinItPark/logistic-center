/**
 * Generated by orval v6.25.0 🍺
 * Do not edit manually.
 * OpenAPI definition
 * OpenAPI spec version: v0
 */
import axios from 'axios'
import type {
  AxiosRequestConfig,
  AxiosResponse
} from 'axios'
export interface DriverLicense {
  id?: number;
  name?: string;
}

export interface DriverResponse {
  driverLicense?: DriverLicense;
  experienceMonth?: number;
  id?: number;
  owner?: UserResponse;
  rating?: number;
  sumWay?: number;
}

export interface SearchDriverQuery {
  driverLicenseId?: number;
  experienceMonth?: number;
  id?: number;
  limit?: number;
  offset?: number;
  ownerId?: number;
  rating?: number;
  sumWay?: number;
}

export type UserResponseRole = typeof UserResponseRole[keyof typeof UserResponseRole];


// eslint-disable-next-line @typescript-eslint/no-redeclare
export const UserResponseRole = {
  DRIVER: 'DRIVER',
  MANAGER: 'MANAGER',
} as const;

export interface Language {
  language?: string;
  level?: string;
}

export interface FillUserDataCommand {
  email?: string;
  fullName?: string;
  languages?: Language[];
  login?: string;
}

export interface DateInfo {
  createdAt?: string;
  deletedAt?: string;
}

export interface UserResponse {
  dateInfo?: DateInfo;
  email?: string;
  fullName?: string;
  id?: number;
  languages?: Language[];
  login?: string;
  role?: UserResponseRole;
}

export interface SearchParams {
  dateInfo?: DateInfo;
  email?: string;
  fullName?: string;
  id?: number;
  languages?: Language[];
  limit?: number;
  login?: string;
  offset?: number;
}

export type ApiErrorType = typeof ApiErrorType[keyof typeof ApiErrorType];


// eslint-disable-next-line @typescript-eslint/no-redeclare
export const ApiErrorType = {
  validation: 'validation',
  business: 'business',
  system: 'system',
} as const;

export type ApiErrorStatus = typeof ApiErrorStatus[keyof typeof ApiErrorStatus];


// eslint-disable-next-line @typescript-eslint/no-redeclare
export const ApiErrorStatus = {
  '100_CONTINUE': '100 CONTINUE',
  '101_SWITCHING_PROTOCOLS': '101 SWITCHING_PROTOCOLS',
  '102_PROCESSING': '102 PROCESSING',
  '103_EARLY_HINTS': '103 EARLY_HINTS',
  '103_CHECKPOINT': '103 CHECKPOINT',
  '200_OK': '200 OK',
  '201_CREATED': '201 CREATED',
  '202_ACCEPTED': '202 ACCEPTED',
  '203_NON_AUTHORITATIVE_INFORMATION': '203 NON_AUTHORITATIVE_INFORMATION',
  '204_NO_CONTENT': '204 NO_CONTENT',
  '205_RESET_CONTENT': '205 RESET_CONTENT',
  '206_PARTIAL_CONTENT': '206 PARTIAL_CONTENT',
  '207_MULTI_STATUS': '207 MULTI_STATUS',
  '208_ALREADY_REPORTED': '208 ALREADY_REPORTED',
  '226_IM_USED': '226 IM_USED',
  '300_MULTIPLE_CHOICES': '300 MULTIPLE_CHOICES',
  '301_MOVED_PERMANENTLY': '301 MOVED_PERMANENTLY',
  '302_FOUND': '302 FOUND',
  '302_MOVED_TEMPORARILY': '302 MOVED_TEMPORARILY',
  '303_SEE_OTHER': '303 SEE_OTHER',
  '304_NOT_MODIFIED': '304 NOT_MODIFIED',
  '305_USE_PROXY': '305 USE_PROXY',
  '307_TEMPORARY_REDIRECT': '307 TEMPORARY_REDIRECT',
  '308_PERMANENT_REDIRECT': '308 PERMANENT_REDIRECT',
  '400_BAD_REQUEST': '400 BAD_REQUEST',
  '401_UNAUTHORIZED': '401 UNAUTHORIZED',
  '402_PAYMENT_REQUIRED': '402 PAYMENT_REQUIRED',
  '403_FORBIDDEN': '403 FORBIDDEN',
  '404_NOT_FOUND': '404 NOT_FOUND',
  '405_METHOD_NOT_ALLOWED': '405 METHOD_NOT_ALLOWED',
  '406_NOT_ACCEPTABLE': '406 NOT_ACCEPTABLE',
  '407_PROXY_AUTHENTICATION_REQUIRED': '407 PROXY_AUTHENTICATION_REQUIRED',
  '408_REQUEST_TIMEOUT': '408 REQUEST_TIMEOUT',
  '409_CONFLICT': '409 CONFLICT',
  '410_GONE': '410 GONE',
  '411_LENGTH_REQUIRED': '411 LENGTH_REQUIRED',
  '412_PRECONDITION_FAILED': '412 PRECONDITION_FAILED',
  '413_PAYLOAD_TOO_LARGE': '413 PAYLOAD_TOO_LARGE',
  '413_REQUEST_ENTITY_TOO_LARGE': '413 REQUEST_ENTITY_TOO_LARGE',
  '414_URI_TOO_LONG': '414 URI_TOO_LONG',
  '414_REQUEST_URI_TOO_LONG': '414 REQUEST_URI_TOO_LONG',
  '415_UNSUPPORTED_MEDIA_TYPE': '415 UNSUPPORTED_MEDIA_TYPE',
  '416_REQUESTED_RANGE_NOT_SATISFIABLE': '416 REQUESTED_RANGE_NOT_SATISFIABLE',
  '417_EXPECTATION_FAILED': '417 EXPECTATION_FAILED',
  '418_I_AM_A_TEAPOT': '418 I_AM_A_TEAPOT',
  '419_INSUFFICIENT_SPACE_ON_RESOURCE': '419 INSUFFICIENT_SPACE_ON_RESOURCE',
  '420_METHOD_FAILURE': '420 METHOD_FAILURE',
  '421_DESTINATION_LOCKED': '421 DESTINATION_LOCKED',
  '422_UNPROCESSABLE_ENTITY': '422 UNPROCESSABLE_ENTITY',
  '423_LOCKED': '423 LOCKED',
  '424_FAILED_DEPENDENCY': '424 FAILED_DEPENDENCY',
  '425_TOO_EARLY': '425 TOO_EARLY',
  '426_UPGRADE_REQUIRED': '426 UPGRADE_REQUIRED',
  '428_PRECONDITION_REQUIRED': '428 PRECONDITION_REQUIRED',
  '429_TOO_MANY_REQUESTS': '429 TOO_MANY_REQUESTS',
  '431_REQUEST_HEADER_FIELDS_TOO_LARGE': '431 REQUEST_HEADER_FIELDS_TOO_LARGE',
  '451_UNAVAILABLE_FOR_LEGAL_REASONS': '451 UNAVAILABLE_FOR_LEGAL_REASONS',
  '500_INTERNAL_SERVER_ERROR': '500 INTERNAL_SERVER_ERROR',
  '501_NOT_IMPLEMENTED': '501 NOT_IMPLEMENTED',
  '502_BAD_GATEWAY': '502 BAD_GATEWAY',
  '503_SERVICE_UNAVAILABLE': '503 SERVICE_UNAVAILABLE',
  '504_GATEWAY_TIMEOUT': '504 GATEWAY_TIMEOUT',
  '505_HTTP_VERSION_NOT_SUPPORTED': '505 HTTP_VERSION_NOT_SUPPORTED',
  '506_VARIANT_ALSO_NEGOTIATES': '506 VARIANT_ALSO_NEGOTIATES',
  '507_INSUFFICIENT_STORAGE': '507 INSUFFICIENT_STORAGE',
  '508_LOOP_DETECTED': '508 LOOP_DETECTED',
  '509_BANDWIDTH_LIMIT_EXCEEDED': '509 BANDWIDTH_LIMIT_EXCEEDED',
  '510_NOT_EXTENDED': '510 NOT_EXTENDED',
  '511_NETWORK_AUTHENTICATION_REQUIRED': '511 NETWORK_AUTHENTICATION_REQUIRED',
} as const;

export interface ApiError {
  message?: string;
  status?: ApiErrorStatus;
  type?: ApiErrorType;
}





  export const search = <TData = AxiosResponse<UserResponse[]>>(
    searchParams: SearchParams, options?: AxiosRequestConfig
 ): Promise<TData> => {
    return axios.post(
      `/api/user/search`,
      searchParams,options
    );
  }

export const create = <TData = AxiosResponse<void>>(
    fillUserDataCommand: FillUserDataCommand, options?: AxiosRequestConfig
 ): Promise<TData> => {
    return axios.post(
      `/api/user/create`,
      fillUserDataCommand,options
    );
  }

export const search1 = <TData = AxiosResponse<DriverResponse[]>>(
    searchDriverQuery: SearchDriverQuery, options?: AxiosRequestConfig
 ): Promise<TData> => {
    return axios.post(
      `/api/drivers/search`,
      searchDriverQuery,options
    );
  }

export type SearchResult = AxiosResponse<UserResponse[]>
export type CreateResult = AxiosResponse<void>
export type Search1Result = AxiosResponse<DriverResponse[]>

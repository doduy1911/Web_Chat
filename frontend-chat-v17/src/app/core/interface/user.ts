export interface User {
  username?:String,
  password?:String,
  status?:Status,
  avatarUrl?:String


}
export enum Status{
  ONlINE = "ONLINE",
  OFFLINE = "OFFLINE"
}

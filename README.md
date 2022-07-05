# Project. 꼼지락

> 꼼수를 아는 즐거움. 꼼 知 樂  
> 정은진(팀장) 김수연 박성철 양혜선 어지예 장준수  

> AWS RDS, S3 관련 ENDPOINT, ID, PW, KEY값들 지움.  
> 빌드파일 **미참조**.     
___
<div align="center">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177405710-e96062f2-4696-4eaa-a372-aa59e833bddf.png">
</div>

<br>
2021/7 ~ 2021/8 : 6주간의 프로젝트.

- 생활에서 도움이 될 좋은 팁, 훈수를 공유하는 웹 서비스를 주제로 6인 팀 프로젝트 진행.
- 꼼수를 아는 즐거움이라는 뜻에서 프로젝트명 ‘꼼지락’ 선정.
- 지식인과 같은 정보 공유와 더불어 WebRTC를 이용하여 실시간 정보 공유나, 녹화된 영상을 통한 정보 공유 기능을 추가한 웹 서비스.

---
<div align="center">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177405809-efa870d7-019f-41f3-85c8-5b989d8c1e5f.png">
</div>

**기능 설명 :** 

- 텍스트, 이미지, 영상을 사용한 게시글 작성을 통한 지식 공유.
- 라이브 스트리밍 기능을 통해 실시간으로 소통하며 정보 공유.
- 많은 시청자 수를 가진 라이브 강조.

<br>

|기능&nbsp;&nbsp;&nbsp;&nbsp;|GIF|
|:--|:--:|
|팁 게시글 등록|<img src="https://user-images.githubusercontent.com/5960472/177418416-0e46c685-3d84-41f4-9900-8895ddc12aee.gif" width="80%">|
|팁 짧은 영상 등록&nbsp;&nbsp;|<img src="https://user-images.githubusercontent.com/5960472/177415352-e5c05bf8-73a2-4f0a-92f8-08d5f2cca059.gif" width="80%">|
|팁 Q&A|<img src="https://user-images.githubusercontent.com/5960472/177418870-e0240684-0613-41d3-83ec-ee8451cfa77e.gif" width="80%">|
|팁 라이브|<img src="https://user-images.githubusercontent.com/5960472/177419879-cb6acc22-862e-4436-932f-320910f3eead.gif" width="80%">|



<br><br>
<div align="center">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177406757-7d153f43-3b4f-4070-ab20-7a49c3de7647.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177406860-61216189-e967-4446-bdf2-2155fb5bca54.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177406927-5b9915bd-abf1-444b-adb3-9f98c6362f2f.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177407016-636b2c59-a732-48ef-ae0f-40699966df0c.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177407055-bd28930a-2ed6-4580-89ef-1431389d9d39.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177407138-5052d984-fa38-48ff-a3fa-d168d289927a.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177407197-47f7d263-6458-4ef1-ac1b-f93c2531aeac.png">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177407251-7c293573-c326-4118-b472-5665d75f927f.png">
</div>


<br>

**기대 효과**

<div align="center">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177406070-b4c8ff55-5b55-43f5-b8f1-403ecfa043a1.png">
</div>


---

**구성**  
<div align="center">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177406183-a4cdbb2a-2e98-4d49-88e8-4b3792eaae42.png">
</div>  

<br><br>

**프로젝트 기술**

<div align="center">
<image width="80%", src="https://user-images.githubusercontent.com/5960472/177406426-546d9ab3-90a5-4007-ae76-3c7e039b21d7.png">
</div>  


___


# **담당 파트 :**

- 역할 : 라이브 스트리밍 Backend, 인프라.
- 스택 : Spring Boot, MySQL, WebRTC, Spring Data JPA, Jira, GitHub  

- 인프라 부분
> AWS EC2에 Docker를 통해 OpenVidu 서버를 올림, Nginx 웹 서버를 리버스 프록시를 통해 HTTPS 으로만 접속, 구현한 서비스 배포.  
- 라이브 스트리밍 백엔드
> WebRTC을 구현한 OpenVidu를 이용한 라이브 스트리밍을 Spring Boot를 사용해 라이브 관리, 라이브 녹화 관리 등의 기능을 RestAPI로 구현.
- 업체로부터 도메인을 구매해 웹서비스 배포. 제공받았던 EC2 만료되면서 서비스 종료.  

<br>  

### 백엔드 작업 코드  

- Controller  
> [LiveController.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/controller/LiveController.java)
- Entity  
> [Live.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/db/entity/Live.java)  
- Repository  
> [LiveRepository.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/db/repository/LiveRepository.java)  
> [LiveRepositorySupport.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/db/repository/LiveRepositorySupport.java)  
- Dto
> [LiveInfoPostReq.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/dto/LiveInfoPostReq.java)  
> [LiveRecordReq.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/dto/LiveRecordReq.java)  
> [LiveSessionReq.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/dto/LiveSessionReq.java)  
- Service
> [LiveService.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/service/LiveService.java)  
> [LiveServiceImpl.java](https://github.com/Try615/ggomzirak/blob/main/backend/src/main/java/com/ggomzirak/service/LiveServiceImpl.java)  

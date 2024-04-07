1. What is docker

- Docker là một tool chạy ứng dụng trên một môi trường độc lập
- Nó tương tự như máy ảo
- Ứng dụng có thể chạy cùng một môi trường
- Tiêu chuẩn deploy cho software
- Sự khác nhau giữa container và virtual machine
  - Container: chạy trên host, chia sẻ kernel với host, không chạy trên một OS riêng lẻ, dung lượng cài đặt nhỏ hơn VM
  - Virtual Machine: chạy trên host, có một OS riêng lẻ, dung lượng cài đặt lớn hơn container

2. Docker image and container

- Docker image:
  - Là một template cho phép tạo ra môi trường mà mình có thể chọn
  - Có mọi thứ bạn cần để chạy app
- Docker container:
  - chạy một instance của image

3. Câu lệnh trong docker

- docker image
- docker container
- docker run --name image_name -d -p 8080:80 --name_image :

* -d giúp container chỉ định cho docker deamon chạy container ở chế độ detached(tách rời). Khi container chạy trong chế độ này thì container sẽ chạy nền và không ảnh hưởng đến terminal đang sử dụng
* -p giúp container sẽ chạy một port 8080 trên host và ánh xạ đến port của image để có thể match với nhau, có thể để nhiều -p. VD: docker run -d -p 3000:80 -p 8080:80 nginx
* --name giúp container sẽ được định nghĩa một tên theo ý muốn chứ không phải random

- câu lệnh dừng docker: docker stop container_id/names
- câu lệnh quản lý container

  - docker ps --help: sẽ hiển thị các flag mong muốn

- docker ps -aq -> lấy ra tất cả id của container (đang chạy hoặc đã dừng)
- docker rm $(docker ps -aq) -> xóa tất cả các container theo id
- muốn xóa một container thì phải dừng container đó hoặc thêm -f để có thể xóa bất kỳ nó đang dừng hay hoạt động

docker format: ID\t{{.ID}}\nName\t{{.Names}}\nImage\t{{.Image}}\nStatus\t{{.Status}}\nPorts\t{{.Ports}}\nCommand\t{{.Command}}\nCreated\t{{.CreatedAt}}\nSize\t{{.Size}}\n
export FORMAT=ID\t{{.ID}}\nName\t{{.Names}}\nImage\t{{.Image}}\nStatus\t{{.Status}}\nPorts\t{{.Ports}}\nCommand\t{{.Command}}\nCreated\t{{.CreatedAt}}\nSize\t{{.Size}}\n

docker ps --format=%FORMAT

4. Docker volumnes

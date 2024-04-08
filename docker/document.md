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
export FORMAT="ID\t{{.ID}}\nName\t{{.Names}}\nImage\t{{.Image}}\nStatus\t{{.Status}}\nPorts\t{{.Ports}}\nCommand\t{{.Command}}\nCreated\t{{.CreatedAt}}\nSize\t{{.Size}}\n"

docker ps --format=$FORMAT

4. Docker volumnes

- Cho phép dữ liệu được chia sẻ giữa các container Docker hoặc giữa container và máy host.
- Giữ cho dữ liệu không thay đổi khi container được xóa hoặc khởi động lại

5. Dockerfile

- Một Dockerfile là một tệp văn bản chứa một loạt các hướng dẫn để tự động hóa quá trình xây dựng một hình ảnh Docker. Mỗi Dockerfile mô tả một bước trong quá trình xây dựng hình ảnh cuối cùng, bao gồm cách cài đặt và cấu hình môi trường cho ứng dụng hoặc dịch vụ cụ thể mà hình ảnh sẽ chạy.

- Dockerfile thường bao gồm các hướng dẫn như FROM, RUN, COPY, CMD, EXPOSE, và WORKDIR để mô tả các bước cần thiết để tạo ra một hình ảnh Docker. Dưới đây là một số hướng dẫn phổ biến trong Dockerfile:

- FROM: Xác định hình ảnh cơ sở mà bạn muốn xây dựng hình ảnh của mình trên.
- RUN: Chạy các lệnh trong một bản sao tạm thời của container và tạo ra một lớp mới trong hình ảnh khi hoàn thành.
- COPY hoặc ADD: Sao chép các tệp và thư mục từ máy chủ nơi bạn xây dựng hình ảnh vào hình ảnh Docker.
- CMD hoặc ENTRYPOINT: Xác định lệnh mặc định mà container sẽ thực thi khi được khởi chạy.
- EXPOSE: Xác định cổng mạng mà container sẽ lắng nghe các kết nối từ bên ngoài.
- WORKDIR: Xác định thư mục làm việc mặc định cho các lệnh trong Dockerfile.
- Dockerfile cho phép bạn tự động hóa quá trình xây dựng và cấu hình các môi trường phát triển và triển khai của ứng dụng của bạn, giúp đơn giản hóa việc triển khai và chia sẻ ứng dụng trong

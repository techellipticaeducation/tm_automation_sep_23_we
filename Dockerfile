FROM openjdk:11
COPY . /app
WORKDIR /app/bin
CMD ["java","tm_automation_sep_23_we.SessionCode1"]